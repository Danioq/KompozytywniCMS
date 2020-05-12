package io.kompozytywni.api;

import io.kompozytywni.model.Member;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MemberApiController implements MemberApi {

    private static final Logger log = LoggerFactory.getLogger(MemberApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public MemberApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<Void> getMembers() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addMember(Member body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteMember(Long memberId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Member> getMemberById(Long memberId) {
        return new ResponseEntity<Member>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateMember(Member body, Long memberId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> uploadImageToMember(Long memberId, String additionalMetadata, MultipartFile photo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
