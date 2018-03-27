package FirstMavenProject.MarvenProject;

import org.springframework.beans.factory.annotation.Autowired;

public class MessagePrinter {
	final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
