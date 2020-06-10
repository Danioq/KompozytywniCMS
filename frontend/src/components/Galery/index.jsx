import React from "react";
import butterfly from "./motylek.jpg";
import water from "./woda.jpg";
import dog from "./piesio.jpg";
import flowers from "./kwiatki.jpg";
import block from "./blok.jpg";
import fruit from "./owocki.jpg";
import tree from "./drzewko.jpg";
import GaleryItem from "./GaleryItem";
import { GaleryList, Img } from "./styledElements";
import { Modal, Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./style.css";

const data = [
  {
    title: "Photo1",
    photo: butterfly,
  },
  {
    title: "Photo2",
    photo: water,
  },
  {
    title: "Photo3",
    photo: dog,
  },
  {
    title: "Photo4",
    photo: flowers,
  },
  {
    title: "Photo5",
    photo: block,
  },
  {
    title: "Photo6",
    photo: fruit,
  },
  {
    title: "Photo7",
    photo: tree,
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
          <h3>{props.title}</h3>
        </Modal.Title>
      </Modal.Header>
      <Modal.Body className="modal-container">
        <Img src={props.photo} alt={props.title} />
      </Modal.Body>
    </Modal>
  );
}

function ImageButton(props) {
  const [modalShow, setModalShow] = React.useState(false);
  return (
    <Button
      className="photo-trigger"
      variant="primary"
      onClick={() => setModalShow(true)}
    >
      <GaleryItem title={props.title} photo={props.photo} />
      <MyVerticallyCenteredModal
        show={modalShow}
        onHide={() => setModalShow(false)}
        title={props.title}
        photo={props.photo}
      />
    </Button>
  );
}

export default function Galery(props) {
  return (
    <React.Fragment>
      <GaleryList>
        {data.map((e) => (
          <ImageButton {...e} />
        ))}
      </GaleryList>
    </React.Fragment>
  );
}
