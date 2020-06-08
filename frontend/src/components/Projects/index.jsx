import React from 'react';
import {ProjectList} from './styledElement'
import ProjectTitle from './ProjectTitle'
import image from 'images/industry_news.jpg'

const data = [{
    title: 'Project1',
    photo: image,
    //textContent: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.',
    addDate: '15.05.2020',
    addTime: '15:00'
    }, 
    {
    title: 'Project2',
    photo: image,
    // textContent: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.',
    addDate: '04.02.2020',
    addTime: '15:00'
    }, 
    {
    title: 'Project3',
    photo: image,
    //textContent: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.',
    addDate: '19.12.2019',
    addTime: '15:00'
    }
];


export default function Projects(props) {
    return <React.Fragment>
        
        <ProjectList>
            {data.map(e =>
                <ProjectTitle title = {e.title}
                                photo = {e.photo}
                                textContent = {e.textContent}
                                addDate = {e.addDate}
                                addTime = {e.addTime} />)}
        </ProjectList>
    </React.Fragment>
}