import React from 'react';
import styled from 'styled-components';

const TextContentPreview = styled.p`
`;

export default function NewsBasicText(props) {
    return <TextContentPreview>
        {props.textContent}
    </TextContentPreview>    
}