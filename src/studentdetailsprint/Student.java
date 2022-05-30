/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetailsprint;

/**
 * data - template - student -entity - > =
 * @author srinivsi ,test ,hello,br,tt
 */
public class Student 
{
    //Encapsulation , private variable,
    private String name ;
    private int age;
    private int semester;
    private boolean partTime;
    private String coursecode;
    private boolean coop;
  
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the partTime
     */
    public boolean isPartTime() {
        return partTime;
    }

    /**
     * @param partTime the partTime to set
     */
    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    /**
     * @return the coop
     */
    public boolean isCoop() {
        return coop;
    }

    /**
     * @param coop the coop to set
     */
    public void setCoop(boolean coop) {
        this.coop = coop;
    }

    /**
     * @return the parttime
     */
   
}
