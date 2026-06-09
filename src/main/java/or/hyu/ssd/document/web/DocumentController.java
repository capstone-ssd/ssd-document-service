package or.hyu.ssd.document.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/documents")
public class DocumentController {

    @GetMapping("/sample")
    public Map<String, Object> sample() {
        return Map.of(
                "service", "ssd-document-service",
                "documentId", 1L,
                "title", "SSD MSA Sample Document");
    }
}
