import React from 'react';
import styled from 'styled-components';

const Image = styled.img`
    height: 10vh;
    margin: 10px;
    padding-right: 10px;
    float: left;
`;

export default function NewsBasicImage(props){
    return <Image src={props.photo} alt="NewsImage" />
}