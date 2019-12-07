package com.ufjf.specialist.viewmodel;

import com.ufjf.specialist.drools.DroolsHelper;
import com.ufjf.specialist.model.Animal;
import com.ufjf.specialist.model.Quiz;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.util.Clients;

/**
 *
 * @author ltosc
 */
public class IndexViewModel 
{
    private boolean disableBtnForward;
    private boolean disableBtnSend;
    
    private Quiz quiz;
    private DroolsHelper drools;
    
    private final int maxQuestionID = 7;
    private int currentQuestionID;
    private String currentQuestionId;
    
    private String resultAnimal;
    
    @AfterCompose
    public void doAfterCompose(@ContextParam(ContextType.VIEW) Component view, @ContextParam(ContextType.PAGE) Page page) 
    {
        Selectors.wireComponents(view, this, false);
        
        disableBtnForward = false;
        disableBtnSend = true;
        
        currentQuestionID = 1;
        currentQuestionId = "q" + currentQuestionID;
        
        Animal.makeListOfAnimals();
        quiz = new Quiz();
        
        drools = new DroolsHelper();
        drools.loadBaseKnowledge();
    }
    
    @Command
    public void setAnswer(@BindingParam("answerVariable") String answerVariable, @BindingParam("answer") int answer)
    {
        try 
        {
            Field field = Quiz.class.getDeclaredField(answerVariable);
            field.setAccessible(true);
            field.set(quiz, answer);
        } 
        catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(IndexViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Command
    @NotifyChange({"disableBtnForward", "disableBtnSend"})
    public void nextQuestion()
    {
        Clients.evalJavaScript(String.format("toggleDiv('%s')", currentQuestionId));
        
        currentQuestionID++;
        
        if(currentQuestionID == maxQuestionID)
        {
            disableBtnForward = true;
            disableBtnSend = false;
        }
        else
        {
            disableBtnForward = false;
            disableBtnSend = true;
        }
        
        currentQuestionId = "q" + currentQuestionID;
        Clients.evalJavaScript(String.format("toggleDiv('%s')", currentQuestionId));
    }
    
    @Command
    @NotifyChange({"resultAnimal"})
    public void sendQuiz()
    {
        drools.execute(quiz);
        resultAnimal = quiz.getResultAnimal();
        
        Clients.evalJavaScript(String.format("toggleDiv('div-questions')"));
        Clients.evalJavaScript(String.format("toggleDiv('div-result')"));
    }

    /**
     * @return the disableBtnForward
     */
    public boolean isDisableBtnForward() {
        return disableBtnForward;
    }

    /**
     * @param disableBtnForward the disableBtnForward to set
     */
    public void setDisableBtnForward(boolean disableBtnForward) {
        this.disableBtnForward = disableBtnForward;
    }

    /**
     * @return the disableBtnSend
     */
    public boolean isDisableBtnSend() {
        return disableBtnSend;
    }

    /**
     * @param disableBtnSend the disableBtnSend to set
     */
    public void setDisableBtnSend(boolean disableBtnSend) {
        this.disableBtnSend = disableBtnSend;
    }

    /**
     * @return the quiz
     */
    public Quiz getQuiz() {
        return quiz;
    }

    /**
     * @param quiz the quiz to set
     */
    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
    
    /**
     * @return the resultAnimal
     */
    public String getResultAnimal() {
        return resultAnimal;
    }

    /**
     * @param resultAnimal the resultAnimal to set
     */
    public void setResultAnimal(String resultAnimal) {
        this.resultAnimal = resultAnimal;
    }
}
