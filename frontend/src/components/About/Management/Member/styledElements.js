import styled from 'styled-components';

export let Picture = styled.img`
    width: 15vh;
    float: left;
    margin-right: 2vh;
    border-radius: 7.5vh;
`;

export let Description = styled.p`
`;

export let Name = styled.h3`

`;

export let Function = styled.h2`

`;

export let MemberContainer = styled.li`
    border: 5px #7FFE02 solid;
    border-radius: 5vh;
    clear: both;
    padding: 20px;
    min-height: 15vh;
    margin: 1vh;
    width: 35vw;
    display: inline-block;
    &:hover {
    background: #C4C4C4;
  }
`;