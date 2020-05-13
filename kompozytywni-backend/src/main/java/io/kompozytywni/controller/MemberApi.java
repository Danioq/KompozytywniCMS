package io.kompozytywni.controller;

import io.kompozytywni.model.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RequestMapping
public interface MemberApi {

    @RequestMapping(value = "/members",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Member>> getMembers();

    @RequestMapping(value = "/member",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addMember(@Valid @RequestBody Member body);

    @RequestMapping(value = "/member/{memberId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMember(@PathVariable("memberId") Long memberId);

    @RequestMapping(value = "/member/{memberId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Member> getMemberById(@PathVariable("memberId") Long memberId);

    @RequestMapping(value = "/member/{memberId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateMember(@Valid @RequestBody Member body, @PathVariable("memberId") Long memberId);

    @RequestMapping(value = "/member/{memberId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<Void> uploadImageToMember(@PathVariable("memberId") Long memberId, @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata, @Valid @RequestPart(value="photo", required=false) MultipartFile photo);
}
