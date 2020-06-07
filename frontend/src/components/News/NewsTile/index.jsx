import React from 'react'
import {NewsTileContainer, Picture, Title, Text, Date} from './styledElements'



export default function NewsTile(props) {
    return <NewsTileContainer>
        <Picture src={props.photo}/>
        <Title>{props.title}</Title>
        <Date>{props.addDate} {props.addTime}</Date>
        <Text>{props.textContent}</Text>
    </NewsTileContainer>
}