# Ticket-Management-System
This project is a **Ticket Management System** for concerts and volleyball matches. It reads event data from a text file (`dailytickets.txt`), processes it, and allows for the sale of tickets while checking for availability. 
## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Classes](#classes)
- [Exception Handling](#exception-handling)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The system supports two types of events:
- **Concerts**: Events involving a performing artist or band.
- **Volleyball Matches**: Events between two volleyball teams.

Each event contains information about:
- Place
- Date
- Start time
- Number of available tickets
- Price per ticket

The program imports data from a file (`dailytickets.txt`), which includes details for both concerts and volleyball matches. After the data is imported, users can simulate the selling of tickets for these events.

## Features

- **Importing Events**: The system reads from a file, processing both concerts and volleyball matches.
- **Selling Tickets**: The system can sell tickets for both concerts and volleyball matches, with a check for ticket availability.
- **Exception Handling**: The system throws custom exceptions for invalid rows in the data file or when tickets are no longer available.
- **Reflection Usage**: It uses Java Reflection to dynamically retrieve the number of fields from the class structure.
  
## Installation

### Prerequisites

- Java 8 or higher.
- A text file named `dailytickets.txt` should be placed in the project directory. This file should contain details about the concerts and volleyball matches in the following format:


### Cloning the Repository

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/ticket-management-system.git
cd ticket-management-system

Running the Program
You can compile and run the main program using the following commands:

1. Compile the project
2. Run the main application:
   ```bash
  java control.EventProcessing

### Usage

On running the program, the system will import data from dailytickets.txt and display the number of loaded concerts and volleyball matches.
You can simulate ticket sales by invoking the sellTicket() method on any event.

## Classes
### Main Classes
1. Event (Abstract):

- Base class for all events.
- Fields: place, date, startHour, numberOFTickets, priceOfTicket.
- Abstract method: sellTicket(int numberOfTickets).

2. Concert:

 - Inherits from Event.
 - Additional field: starName.
 - VolleyBallMatch:

3. Inherits from Event.
 - Additional fields: firstTeam, secondTeam.

## Helper Classes
1. TicketLoader:

- Handles importing events from the file.
- Uses reflection to dynamically retrieve field information.
2. EventProcessing:

- Main class that handles the loading and processing of events.

## Exception Handling
- NoMoreTicketException:
- Thrown when there are no more tickets available for an event.
- UnrecognisedRowException:
- Thrown when an unrecognised row is found in the input file during import.

## Contributing
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch
3. Make your changes and commit them:
   ```bash
   git commit -m "Feature description"
4. Push to your fork and submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
```vbnet

 Key Points:
- The installation and usage sections explain how to set up and run the project.
- The classes section provides a summary of the core classes and their functionality.
- Exception handling is highlighted as part of the system's robust error management.

You can replace `https://github.com/Amadeus0004/Ticket-Management-System` with your actual GitHub repository link.

Let me know if you'd like to make any adjustments!

