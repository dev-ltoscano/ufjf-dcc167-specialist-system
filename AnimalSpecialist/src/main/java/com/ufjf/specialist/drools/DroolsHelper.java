package com.ufjf.specialist.drools;

import com.ufjf.specialist.model.Quiz;
import java.util.Collection;
import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

/**
 *
 * @author ltosc
 */
public class DroolsHelper
{
    private KnowledgeBase baseKnowledge;
    
    public void loadBaseKnowledge()
    {
        KnowledgeBuilder builderKnowledge = KnowledgeBuilderFactory.newKnowledgeBuilder();
        
        builderKnowledge.add
        (
                ResourceFactory.newClassPathResource("drools/rules.drl"),
                ResourceType.DRL
        );
        
        if (builderKnowledge.hasErrors()) 
        {
            System.out.println(builderKnowledge.getErrors().toString());
            throw new RuntimeException("Unable to compile 'rules.drl'.");
        }
        
        Collection<KnowledgePackage> knowledgePackageCollection = builderKnowledge.getKnowledgePackages();
        
        baseKnowledge = KnowledgeBaseFactory.newKnowledgeBase();
        baseKnowledge.addKnowledgePackages(knowledgePackageCollection);
    }
    
    public void execute(Quiz quiz)
    {
        StatefulKnowledgeSession knowledgeSession = baseKnowledge.newStatefulKnowledgeSession();
        
        knowledgeSession.insert(quiz);
        knowledgeSession.fireAllRules();
        knowledgeSession.dispose();
    }
}
