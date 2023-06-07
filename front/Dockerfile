# Use a Jetty base image
FROM jetty:9.4-jre8

# Copy your web application WAR file to the Jetty webapps directory
COPY target/procedimento.war /var/lib/jetty/webapps/ROOT.war

# Expose the default Jetty port
EXPOSE 8080

# Start the Jetty server
CMD ["java", "-jar", "/usr/local/jetty/start.jar"]
