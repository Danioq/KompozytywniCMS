import React from 'react'
import {GalleryCard, Picture, Title} from './styledElements'

export default function GalleryItem(props){
    return <GalleryCard>
        <Picture src={props.photo}/>
        <Title>{props.title}</Title>
    </GalleryCard>
}