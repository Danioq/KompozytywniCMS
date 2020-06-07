// @ts-nocheck
import React from 'react';
import {Name, Picture, Description, Function, MemberContainer} from './styledElements'

export default function Member(props){
    return <MemberContainer>
        <Picture src={props.img} />
        <Function>{props.function}</Function>
        <Name>{props.name}</Name>
        <Description>{props.description}</Description>
    </MemberContainer>;
}