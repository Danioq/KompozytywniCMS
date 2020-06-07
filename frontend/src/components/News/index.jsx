import React from 'react';
import styled from 'styled-components';
import NewsBasic from 'components/News/NewsBasic';
import image from 'images/industry_news.jpg'

const NewsContainer = styled.ul`
    list-style: none;
    margin-top: 40px;
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    grid-auto-flow: row;
    justify-items: center;
    row-gap: 20px;
`;
const data = [{
    title: 'title1',
    photo: image,
    textContent: 'content1',
    addDate: '11.04.2020',
    addTime: '15:00'
}, 
{
    title: 'title2',
    photo: image,
    textContent: 'content2',
    addDate: '11.04.2020',
    addTime: '15:00'
}, 
{
    title: 'title3',
    photo: image,
    textContent: 'content3',
    addDate: '11.04.2020',
    addTime: '15:00'
}];
export default function News(props) {
    return <NewsContainer>
        {data.map(elem => 
            <NewsBasic  title={elem.title}
                        photo = {elem.photo}
                        textContent = {elem.textContent}
                        addDate = {elem.addDate}
                        addTime = {elem.addTime} />)}
    </NewsContainer>
}