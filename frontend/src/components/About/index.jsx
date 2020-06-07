import React from 'react';
import ScienceClub from './ScienceClub'
import Management from './Management'
import styled from 'styled-components';
let AboutContainer = styled.div`
    margin-top: 2vh;
    clear: both;
`;


export default function About() {
    return <AboutContainer>
        <ScienceClub/>
        <Management/>
    </AboutContainer>;
}