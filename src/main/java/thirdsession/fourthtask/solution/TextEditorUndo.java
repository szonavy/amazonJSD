package thirdsession.fourthtask.solution;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    public TextEditorUndo(int size) {
        this.stack = new String[size];
        this.top = -1;
    }

    public void push(String action) {
        if (this.top == this.stack.length - 1) {
            System.out.println("Undo stack is full. Cannot add more actions.");
        } else {
            this.stack[++this.top] = action;
            System.out.println("Action \"" + action + "\" added to undo stack.");
        }

    }

    public String pop() {
        if (this.top == -1) {
            System.out.println("Undo stack is empty. No action to undo.");
            return null;
        } else {
            String action = this.stack[this.top--];
            System.out.println("Undone action: \"" + action + "\"");
            return action;
        }
    }

    public String peek() {
        if (this.top == -1) {
            System.out.println("Undo stack is empty. No action to show.");
            return null;
        } else {
            return this.stack[this.top];
        }
    }

    public void display() {
        if (this.top == -1) {
            System.out.println("Undo stack is empty.");
        } else {
            System.out.print("Undo stack: ");

            for(int i = 0; i <= this.top; ++i) {
                String var10001 = this.stack[i];
                System.out.print("\"" + var10001 + "\" ");
            }

            System.out.println();
        }

    }
}
