 
package alertdialog;

/**
 *
 * @author MH
 */
public class TestClass {
    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder();
        
        builder.setTitle("Title text");
        builder.setMessage("Do you want to exit");
        builder.setPositiveButton(new MyButton("Yes"));
        builder.setNegativeButton(new MyButton("Cancel"));
        
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        
        
        builder.setTitle("Title");
        builder.setMessage("Do you want to cancel");
        builder.setPositiveButton(new MyButton("Go"));
        builder.setNegativeButton(new MyButton("Cancel"));
        
        AlertDialog alertDialog1 = builder.create();
        alertDialog1.show();
    }
}
