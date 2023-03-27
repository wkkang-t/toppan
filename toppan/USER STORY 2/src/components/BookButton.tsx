import React from "react";

interface BookProps {}

const BookButton: React.FC<BookProps> = ({}) => {
  return (
    <>
      <div className="book" id={`book-item-`} data-testid={`book-item-`}>
        <div className="book-content">
          <h1>{}</h1>
          <button
            className="book-toggle"
            id="book-toggle"
            data-testid="book-toggle"
          ></button>
        </div>
      </div>
    </>
  );
};

export default BookButton;
