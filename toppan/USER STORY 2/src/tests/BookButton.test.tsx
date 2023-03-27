import React from "react";
import { render, screen } from "@testing-library/react";
import "@testing-library/jest-dom";
import BookButton from "../components/BookButton";

describe("BookButton", () => {
  test("renders book div with correct data-testid attribute", () => {
    render(<BookButton />);
    const bookDiv = screen.getByTestId("book-item-");
    expect(bookDiv).toBeInTheDocument();
  });

  test("renders book-toggle button with correct data-testid attribute", () => {
    render(<BookButton />);
    const bookToggleButton = screen.getByTestId("book-toggle");
    expect(bookToggleButton).toBeInTheDocument();
  });

  test("book-toggle button has correct className", () => {
    render(<BookButton />);
    const bookToggleButton = screen.getByTestId("book-toggle");
    expect(bookToggleButton).toHaveClass("book-toggle");
  });
});
