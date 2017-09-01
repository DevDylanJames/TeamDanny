/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickquiz;

/**
 *
 * @author student
 */
public class QuestionData 
{

    // Declarations of 3 Strings, used to store the PCName, PCID and IP_Address
    //      data in memory for EACH PCDataRecord.  That is: when one object is instantiated
	//      from this PCDataRecord class, it will record the detail for one PC.
    // These properties - PCName, PCID and IP_Address - are set to private so a calling
    //      class is not able to assign or access the respective values directly.
    //      Access to these properties would be best managed through the respective
    //      getters and setters - see below.
    String Qn = new String();
    String Topic = new String();   
    String Question = new String();
    String AwnserA = new String();
    String AwnserB = new String();
    String AwnserC = new String();
    String AwnserD = new String();
    String CorrectAwnser = new String();
    
    

    /** --------------------------------------------------------
    * Purpose: Constructor for the class: PCDataRecord.
    *          When a PCDataRecord is instantiated, and no default entries
    *          for the 3 properties - PC_Name/PC_ID/IP_Address - are provided,
    *          this method will set default values for each.
    * @param   None.
    * @returns Not applicable.
    * ----------------------------------------------------------
    */    
    public QuestionData()
    {   
        Qn = "QuestionNumber";
        Topic = "Topic";
        Question = "Question";
        AwnserA = "AwnserA";
        AwnserB = "AwnserB";
        AwnserC = "AwnserC";
        AwnserD = "AwnserD";
        CorrectAwnser = "CorrectAwnser";
                
    }


    /** --------------------------------------------------------
    * Purpose: A second constructor for the class: PCDataRecord.
    *          When a PCDataRecord is instantiated and default entries
    *          for the 3 properties - PC_Name/PC_ID/IP_Address - are
    *          provided by the calling class, this constructor will run.
    * @param   PC_Name, PC_ID and IP_Address.
    * @returns Not applicable.
    * ----------------------------------------------------------
    */    
    public QuestionData(String qn, String topic, String question, String awnserA, String awnserB, String awnserC, String awnserD, String correctAwnser)
    {    
        Qn = qn;
        Topic = topic;
        Question = question;
        AwnserA = awnserA;
        AwnserB = awnserB;
        AwnserC = awnserC;
        AwnserD = awnserD;
        CorrectAwnser = correctAwnser;
    }
    
    public QuestionData(String qn, String topic)
    {    
        Qn = qn;
        Topic = topic;
    }


    /** --------------------------------------------------------
    * Purpose: A method that will allow the calling class to set the
    *          3 properties - Name/ID/IP_Address - all at the one time.
    * @param   PC_Name, PC_ID and IP_Address.
    * @returns nothing (void).
    * ----------------------------------------------------------
    */    
   public void SetQuestionData(String qn, String topic, String question, String awnserA, String awnserB, String awnserC, String awnserD, String correctAwnser)
    {    
        Qn = qn;
        Topic = topic;
        Question = question;
        AwnserA = awnserA;
        AwnserB = awnserB;
        AwnserC = awnserC;
        AwnserD = awnserD;
        CorrectAwnser = correctAwnser;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAwnserA() {
        return AwnserA;
    }

    public void setAwnserA(String AwnserA) {
        this.AwnserA = AwnserA;
    }

    public String getAwnserB() {
        return AwnserB;
    }

    public void setAwnserB(String AwnserB) {
        this.AwnserB = AwnserB;
    }

    public String getAwnserC() {
        return AwnserC;
    }

    public void setAwnserC(String AwnserC) {
        this.AwnserC = AwnserC;
    }

    public String getAwnserD() {
        return AwnserD;
    }

    public void setAwnserD(String AwnserD) {
        this.AwnserD = AwnserD;
    }

    public String getCorrectAwnser() {
        return CorrectAwnser;
    }

    public void setCorrectAwnser(String CorrectAwnser) {
        this.CorrectAwnser = CorrectAwnser;
    }   
}
