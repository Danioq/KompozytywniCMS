import styled from 'styled-components'

export let GalleryCard = styled.li`
    border: none;
    box-sizing: border-box;
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
    cursor: pointer;

`;

export let Picture = styled.img`
    width: 150px;
    height: 190px;    
    margin-top: 10px;
    margin-left: 5px;
    margin-right: 5px;
    
`;

export let Title = styled.p`
    margin-top: 10px;
    font-weight: bold;
    font-size: 20px;
`;