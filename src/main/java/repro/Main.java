package repro;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.ResourceCodeResolver;

public class Main {
    public static void main(String[] args) {
        var codeResolver = new ResourceCodeResolver("templates");
        var templateEngine = TemplateEngine.create(codeResolver, ContentType.Plain);

        var output = new StringOutput();
        templateEngine.render("subdirectory/helloworld.txt.jte", null, output);
        System.out.println(output);
    }
}
