package de.consol.devday.markdown;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MarkdownServiceTest {

    @Test
    public void formatList() {
        MarkdownService service = new MarkdownService();
        List<String> abc = List.of("a", "b", "c");
        assertThat(service.formatList(abc)).isEqualTo("* a\n");
        Assert.assertEquals("* a\n* b\n* c", service.formatList(abc));
    }
}
