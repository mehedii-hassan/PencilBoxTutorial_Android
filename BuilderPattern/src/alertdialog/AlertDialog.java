package alertdialog;

/**
 *
 * @author MH
 */
public class AlertDialog {

    private String title;
    private String message;
    private MyButton positiveButton;
    private MyButton negativeButton;

    private AlertDialog() {
    }

    /*

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyButton getPositiveButton() {
        return positiveButton;
    }

    public void setPositiveButton(MyButton positiveButton) {
        this.positiveButton = positiveButton;
    }

    public MyButton getNegativeButton() {
        return negativeButton;
    }

    public void setNegativeButton(MyButton negativeButton) {
        this.negativeButton = negativeButton;
    }
     */
    public void show() {
        System.out.println(this.title);
        System.out.println(this.message);
        //System.out.println(this.getPositiveButton().getName());
        //System.out.println(this.getNegativeButton().getName());
        System.out.println(this.positiveButton.getName());
        System.out.println(this.negativeButton.getName());
    }

    public static class Builder {

        private AlertDialog dialog;

        public Builder() {
            dialog = new AlertDialog();
        }

        public void setTitle(String title) {
            //dialog.setTitle(title);
            dialog.title = title;
        }

        public void setMessage(String message) {
            //dialog.setMessage(message);
            dialog.message = message;
        }

        public void setPositiveButton(MyButton positiveButton) {
            //dialog.setPositiveButton(positiveButton);
            dialog.positiveButton = positiveButton;
        }

        public void setNegativeButton(MyButton negativeButton) {
            //dialog.setNegativeButton(negativeButton);
            dialog.negativeButton = negativeButton;
        }

        public AlertDialog create() {
            return dialog;
        }
    }

}
