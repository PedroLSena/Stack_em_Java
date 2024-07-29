package Page_ex;

import java.util.Stack;

public class BrowserHistory {
    private Stack<Page> historyStack;
    private Stack<Page> forwardStack;

    public BrowserHistory() {
        this.historyStack = new Stack<>();
        this.forwardStack = new Stack<>();
    }

    public void visit(Page page) {
        historyStack.push(page);
        forwardStack.clear();
    }

    public String displayHistory() {
        if (historyStack.isEmpty()) {
            return "historico está vazio.";
        }

        StringBuilder fullHistory = new StringBuilder("Historico: \n");
        for (Page page : historyStack) {
            fullHistory.append(page.toString()).append("\n");
        }

        return fullHistory.toString();
    }

    public Page goBack() {
        if (!historyStack.isEmpty()) {
            Page currentPage = historyStack.pop();
            forwardStack.push(currentPage);
            return currentPage;
        }
        return null; 
    }

    public Page goForward() {
        if (!forwardStack.isEmpty()) {
            Page nextPage = forwardStack.pop();
            historyStack.push(nextPage);
            return nextPage;
        }
        return null; 
    }

    public Stack<Page> getHistoryStack() {
        return historyStack;
    }

    public Stack<Page> getForwardStack() {
        return forwardStack;
    }
}
