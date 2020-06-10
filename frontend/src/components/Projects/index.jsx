import React from "react";
import { ProjectList } from "./styledElement";
import ProjectTitle from "./ProjectTitle";
import image from "images/industry_news.jpg";
import { Modal, Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./style.css";

const data = [
  {
    title: "Project1",
    photo: image,
    textContent:
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.",
    addDate: "15.05.2020",
    addTime: "15:00",
  },
  {
    title: "Project2",
    photo: image,
    textContent:
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.",
    addDate: "04.02.2020",
    addTime: "15:00",
  },
  {
    title: "Project3",
    photo: image,
    textContent:
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.",
    addDate: "19.12.2019",
    addTime: "15:00",
  },
  {
    title: "Project4",
    photo: image,
    textContent:
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pulvinar ex dui, ac lobortis leo tristique at. Praesent tristique laoreet risus, vitae lacinia mi convallis sit amet. Quisque suscipit suscipit neque commodo convallis. Suspendisse et mi turpis. Proin elementum, quam quis auctor dictum, metus tellus dictum velit, id iaculis justo tellus vel tellus. Curabitur efficitur congue arcu malesuada tempor. Integer ut imperdiet turpis. Phasellus lorem quam, suscipit quis rutrum molestie, luctus condimentum magna. Nullam vehicula sem ac aliquet hendrerit. Nunc consequat rutrum metus sit amet fermentum.",
    addDate: "19.12.2019",
    addTime: "15:00",
  },
];

function MyVerticallyCenteredModal(props) {
  return (
    <Modal
      {...props}
      size="lg"
      aria-labelledby="contained-modal-title-vcenter"
      centered
    >
      <Modal.Header closeButton>
        <Modal.Title id="contained-modal-title-vcenter">
          <ProjectTitle title={props.title}
          photo = {props.photo} />
        </Modal.Title>
      </Modal.Header>
      <Modal.Body>
        <h4>{props.addDate} {props.addTime}</h4>
        <p>{props.content}</p>
      </Modal.Body>
      <Modal.Footer>
        <Button onClick={props.onHide}>Close</Button>
      </Modal.Footer>
    </Modal>
  );
}

function ProjectButton(props) {
  const [modalShow, setModalShow] = React.useState(false);
  return (
    <Button
      className="trigger"
      variant="primary"
      onClick={() => setModalShow(true)}
    >
      <ProjectTitle
        title={props.title}
        photo={props.photo}
        addDate={props.addDate}
        addTime={props.addTime}
      />
      <MyVerticallyCenteredModal
        show={modalShow}
        onHide={() => setModalShow(false)}
        title={props.title}
        content={props.textContent}
        photo={props.photo}
        addDate={props.addDate}
        addTime={props.addTime}
      />
    </Button>
  );
}

export default function Projects(props) {
  return (
    <React.Fragment>
      <ProjectList>
        {data.map((e) => (
          <ProjectButton {...e} />
        ))}
      </ProjectList>
    </React.Fragment>
  );
}
