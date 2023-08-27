Feature: Student Life Cycle

Background: Before Counsling
Given Student Submit School Marksheet

Scenario: Medical College

Given Student Bio Mark
When Student Pass the Neet Exam
Then Student Admission in the Medical College


Scenario: Engineering College

Given Student Maths Mark
When Student needs cut off marks
Then Student Admission in the Engineering College