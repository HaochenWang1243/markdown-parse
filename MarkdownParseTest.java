import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinks1() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/markdown-parse/test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks2() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/markdown-parse/test2-file.md");
	    String contents = Files.readString(fileName);
        assertEquals( List.of("link.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinks3() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/markdown-parse/test3-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("link.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinks4() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/markdown-parse/test4-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinks5() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/markdown-parse/test5-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
}
