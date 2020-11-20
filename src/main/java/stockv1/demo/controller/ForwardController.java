package stockv1.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @author Marius Pop
 */
@RestController
public class ForwardController {

    @ApiOperation("get a list of alarms")
    @PostMapping("/alarms")
    public void forwardFile(HttpServletRequest request,
                            HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        response.setHeader("Content-Disposition", "attachment; filename=" + "output.docx");
        response.getOutputStream().write(FileUtils.readFileToByteArray(new File("D:\\GIT\\demo\\CvPop(6Aug2020).docx")));
    }

}
