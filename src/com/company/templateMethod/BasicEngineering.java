package com.company.templateMethod;

/**
 *
 */
public abstract class BasicEngineering {

    public void papers(){
        math();
        softSkills();
//        template
        specialPaper();
    }

    // need custom implementation
    protected abstract void specialPaper();

    private void softSkills() {
        System.out.println("soft skills");
    }

    private void math() {
        System.out.println("Mathematics");
    }
}
