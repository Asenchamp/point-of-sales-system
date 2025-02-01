/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemgt;
import java.util.Stack;
import javax.swing.JFrame;
public class ScreenManager {
    public static final Stack<JFrame> screenStack = new Stack<>();
    
    public static void showScreen(JFrame screen){
        if (!screenStack.isEmpty()){
            screenStack.peek().setVisible(false);
        }
        screenStack.push(screen);
        screen.setVisible(true);
    }
    
    public static void goBack(){
        if (screenStack.size() > 1){
            JFrame currentScreen = screenStack.pop();
            currentScreen.dispose();
            JFrame previousScreen = screenStack.peek();
            previousScreen.setVisible(true);
        }
    }
    
    public static void clearScreen(){
        while(!screenStack.isEmpty()){
            screenStack.pop().dispose();
        }
    }
}
