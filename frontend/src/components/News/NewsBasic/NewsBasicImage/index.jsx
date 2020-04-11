import React from 'react';
import styled from 'styled-components';

const Image = styled.img`
    height: 100%;
    max-width: 100%;
    margin: 10px;
    padding-right: 10px;
`;

export default function NewsBasicImage(props){
    return <Image src={props.photo} alt="NewsImage" />
}