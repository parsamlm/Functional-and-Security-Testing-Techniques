<h1>Functional and Security Testing Techniques</h1>
<p><b>Functional Testing Techniques</b> aim to verify if a software application functions as intended according to the requirements and specifications.
<b>Security Testing Techniques</b> focus on identifying and mitigating vulnerabilities in a software application that could be exploited by attackers.</p>
<p>This course is part of Master of Computer Science (Software & Security Engineering track) programme at university of Genoa, Italy.</p>
<h2>Functional Testing Techniques</h2>
<h3>Content</h3>
<ul>
<li>Basics of Web Applications</li>
<li>Functional Testing</li>
<ul>
<li>Manual vs. Automated Testing</li>
<ul>
<li>Software Testing Fundamentals (Approaches and Techniques)</li>
<li>Unit Testing Tools (e.g., JUnit - TestNG)</li>
</ul>
<li>Automated Testing Approaches and Tools for Web/Mobile Applications</li>
<ul>
<li>Ex. Selenium WebDriver</li>
</ul>
</ul>
<li>Continuous Integration</li>
<ul>
<li>Tools: Jenkins - GitHub Actions</li>
</ul>
<li>API Testing</li>
<ul>
<li>Tools: Postman</li>
</ul>
<li>Mobile Testing</li>
<ul>
<li>Testing Framework: Appium</li>
</ul>
</ul>

<h3>Projects</h3>
<p>In the context of this course, four web applications were subjected to testing procedures. Two of these applications were tested manually, while the remaining applications were tested using automated tools – specifically, <b><i>Selenium</i></b> and <b><i>Assessor+</i></b>.</p>
<p><u>A list of the four web applications tested is provided below:</u></p>
<ul>
<li><b>Bludit:</b> This web application was tested using Selenium and Assessor+.</li>
<ul>
<li><a href="https://github.com/SoftEng-UniGE/BEWT-Specifications/tree/main/bludit"><b>Bludit install instruction</b></a></li>
<li><a href="https://github.com/parsamlm/Functional-and-Security-Testing-Techniques/tree/master/Functional%20Part/Assignment/Bludit"><b>Project assets repository</b></a></li>
</ul>
<li><b>Claroline:</b> This web application was tested manually using Java programming language, JUnit 5, and Selenium WebDriver.</li>
<ul>
<li><a href="https://github.com/SoftEng-UniGE/BEWT-Specifications/tree/main/claroline"><b>Claroline install instruction</b></a></li>
<li><a href="https://github.com/parsamlm/Functional-and-Security-Testing-Techniques/tree/master/Functional%20Part/Assignment/Claroline"><b>Project assets repository</b></a></li>
</ul>
<li><b>Mantisbt:</b> This web application was tested manually using Java programming language, JUnit 5, and Selenium WebDriver.</li>
<ul>
<li><a href="https://github.com/SoftEng-UniGE/BEWT-Specifications/tree/main/mantisbt"><b>Mantisbt install instruction</b></a></li>
<li><a href="https://github.com/parsamlm/Functional-and-Security-Testing-Techniques/tree/master/Functional%20Part/Assignment/MantisBT"><b>Project assets repository</b></a></li>
</ul>
<li><b>Prestashop:</b> This web application was tested using Selenium and Assessor+.</li>
<ul>
<li><a href="https://github.com/SoftEng-UniGE/BEWT-Specifications/tree/main/prestashop"><b>Prestashop install instruction</b></a></li>
<li><a href="https://github.com/parsamlm/Functional-and-Security-Testing-Techniques/tree/master/Functional%20Part/Assignment/Prestashop"><b>Project assets repository</b></a></li>
</ul>
</ul>
<h2>Security Testing Techniques</h2>
<h3>Content</h3>
<ul>
<li>General Introduction</li>
<li>Introduction to Cybersecurity</li>
<li>Automated Security Tools</li>
<li>The HTTP Protocol</li>
<li>Command Injection</li>
<li>Client-side Vulnerability</li>
<li>Denial of Service Attack (DoS)</li>
<li>Mobile Security</li>
</ul>
<h3>Projects</h3>
<h4>Web Service Monitoring Project</h4>
<p>This project implements a monitoring service for web service environments, it is developed in Kotlin by me.</p>
<h4>Goal</h4>
<p>The goal is to monitor a company's website for potential vulnerabilities. The program supports MySQL, WordPress, MongoDB, and Apache Web Server, also it will:</p>
<ul>
<li>Take a list of network services (IP, port, URL, service type) as input.</li>
<li>Dynamically discover the running version of each service (e.g., WordPress 6.4.3).</li>
<li>Identify potential vulnerabilities based on the service type and version using public vulnerability databases.</li>
</ul>
<h4>Additional Features</h4>
<p>The developed program is able to run in two ways:</p>
<ol>
<li>Manually Takes Input File (Json file is supported)</li>
<li>Automatically finds different networks in Docker and gets one from user selection, and look for its services and their vulnerabilities.</li>
</ol>
<h4>Output</h4>
<p>This project is done individually and the program will generate a report file (both PDF and Json) listing vulnerabilities affecting each service, if any.</p>
<p>The project is available at this <a href="https://github.com/parsamlm/Functional-and-Security-Testing-Techniques/tree/master/Security%20Part/VulnerabilityScanner"><b>link</b></a>.</p>
<h4>Additional Works</h4>
<p>In parallel with the development of this tool, I created an open-source Kotlin library named <a href="https://github.com/parsamlm/VulnerabilityFinder"><b>VulnerabilityFinder</b></a>. This library simplifies interacting with the <a href="https://nvd.nist.gov">National Vulnerability Database (NVD)</a> website within Kotlin applications, facilitating the retrieval of service vulnerability information.</p>

<h3>Responsible Use</h3>

This project is intended to develop a tool for the course. It is crucial to remember that this tool should be used
responsibly and ethically. I strongly advocate for its use in improving the security of your own applications and
services, and not for any malicious or unlawful activities.

<h3>Disclaimer</h3>

<b>By utilizing this project, you agree to the following conditions:</b>
<ul>
<li>
You accept full responsibility for any outcomes resulting from the use of this project.
</li>
<li>
The project contributors cannot be held accountable for any damages or harm resulting from the misuse of this tool.
</li>
<li>
We retain the authority to revoke access to the project for any breach of these terms.
</li>
</ul>

<h3>Course Instructor</h3>
<p>The instructor for the Security part is <a href="https://github.com/auino">Enrico Cambiaso</a>.</p>