/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Frequency;

/**
 *
 * @author Nisala
 */
public class SelectFrequancy {
    
    private String name;
    private String f1min;
    private String f1max;
    private String f2min;
    private String f2max;
    private String f3min;
    private String f3max;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getF1min() {
        return f1min;
    }

    public void setF1min(String f1min) {
        this.f1min = f1min;
    }

    public String getF1max() {
        return f1max;
    }

    public void setF1max(String f1max) {
        this.f1max = f1max;
    }

    public String getF2min() {
        return f2min;
    }

    public void setF2min(String f2min) {
        this.f2min = f2min;
    }

    public String getF2max() {
        return f2max;
    }

    public void setF2max(String f2max) {
        this.f2max = f2max;
    }

    public String getF3min() {
        return f3min;
    }

    public void setF3min(String f3min) {
        this.f3min = f3min;
    }

    public String getF3max() {
        return f3max;
    }

    public void setF3max(String f3max) {
        this.f3max = f3max;
    }

    public SelectFrequancy(String name, String f1min, String f1max, String f2min, String f2max, String f3min, String f3max) {
        this.name = name;
        this.f1min = f1min;
        this.f1max = f1max;
        this.f2min = f2min;
        this.f2max = f2max;
        this.f3min = f3min;
        this.f3max = f3max;
    }
    
}
