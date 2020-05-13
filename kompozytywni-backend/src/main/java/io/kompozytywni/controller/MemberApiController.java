package io.kompozytywni.controller;

import io.kompozytywni.model.Member;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kompozytywni.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MemberApiController implements MemberApi {

    @Autowired
    private MemberRepository memberRepository;

    private static final Logger log = LoggerFactory.getLogger(MemberApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public MemberApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
    }

    public @ResponseBody ResponseEntity<List<Member>> getMembers() {
        return new ResponseEntity<>(memberRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Void> addMember(Member body) {
        memberRepository.save(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteMember(Long memberId) {
        memberRepository.delete(memberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public @ResponseBody ResponseEntity<Member> getMemberById(Long memberId) {
        return new ResponseEntity<>(memberRepository.getOne(memberId), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateMember(Member body, Long memberId) {
        Member member = memberRepository.getOne(memberId);
        member.setName(body.getName());
        member.setEmail(body.getEmail());
        member.setPhoneNumber(body.getPhoneNumber());
        member.setPhoto(body.getPhoto());
        member.setRole(body.getRole());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Void> uploadImageToMember(Long memberId, String additionalMetadata, MultipartFile photo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
