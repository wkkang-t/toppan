import React from "react";
import logo from "./logo.svg";
import "./App.css";
import CountryButton from "./components/CountryButton";
import BookButton from "./components/BookButton";

function App() {
  return (
    <div>
      <div className="navbar">
        <CountryButton />
      </div>
      <div className="content">
        <BookButton />
      </div>
    </div>
  );
}

export default App;
