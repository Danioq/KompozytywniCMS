import styled from 'styled-components'


export let ProjectTitleContainer = styled.li`
    border: 5px #7FFE02 solid;
    border-radius: 5vh;
    clear: both;
    padding: 20px;
    min-height: 15vh;
    width: 400px;
    
    box-sizing: border-box;
    margin-left: 10px;;
    margin-right: 10px;
    margin-top: 1vh;
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
    position: relative;
    &:hover {
    background: #C4C4C4;
    
  }
`;

export let Picture = styled.img`
    width: 15vh;
    float: left;
    margin-right: 2vh;
    border-radius: 7.5vh;
    flex-basis: 30%;
`;

export let Title = styled.h1``;

export let Text = styled.p``;

export let Date = styled.p`
  position: absolute;
  right: 5px;
  bottom: 20px;
`;