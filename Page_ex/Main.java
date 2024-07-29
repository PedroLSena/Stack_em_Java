package Page_ex;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visit(new Page("http://google.com", LocalDateTime.now()));
        browserHistory.visit(new Page("https://github.com/PedroLSena", LocalDateTime.now()));
        browserHistory.visit(new Page("https://www.linkedin.com/in/pedro-lucas-0520a3257/", LocalDateTime.now()));

        System.out.println("\n");
        System.out.println("Atual: \n");
        System.out.println(browserHistory.displayHistory());

        browserHistory.goBack();
        System.out.println("Voltar:\n" + browserHistory.displayHistory());

        browserHistory.goForward();
        System.out.println("Prosseguir: \n" + browserHistory.displayHistory());
    }
}
