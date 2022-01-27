import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/cse12-wi22-pa3-LinkedList-starter-main/markdown-parse/test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links =MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
    @Test
    public void testGetLinks2() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/cse12-wi22-pa3-LinkedList-starter-main/markdown-parse/test-file-2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links =MarkdownParse.getLinks(contents);
        assertEquals(List.of("link.com",""), links);
    }
    @Test
    public void testGetLinks3() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/cse12-wi22-pa3-LinkedList-starter-main/markdown-parse/test-file-3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links =MarkdownParse.getLinks(contents);
        assertEquals(List.of(""), links);
    }
    @Test
    public void testGetLinks4() throws IOException{
        Path fileName = Path.of("/Users/hhhqss/Downloads/cse12-wi22-pa3-LinkedList-starter-main/markdown-parse/test-file-4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links =MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
}

