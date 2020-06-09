import React from 'react'
import {ProjectTitleContainer, Picture, Title, Date, Text} from './styledElement'



export default function ProjectTitle(props) {
    return <ProjectTitleContainer>
        <Picture src={props.photo} />
        <Title>{props.title}</Title>
        <Date>{props.addDate} {props.addTime}</Date>
        <Text>{props.text}</Text>
        
    </ProjectTitleContainer>
}