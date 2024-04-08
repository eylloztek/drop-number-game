/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dropNumberGame;

/**
 *
 * @author Eylül Öztek
 */
public class NodeClass<T extends Number> {
    NodeClass up;
    NodeClass down;
    NodeClass left;
    NodeClass right;
    T value;
    int column;
        
    public NodeClass(T value, int column){
        this.value = value;
        this.right = null;
        this.up = null;
        this.down = null;
        this.left = null;
        this.column = column;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
