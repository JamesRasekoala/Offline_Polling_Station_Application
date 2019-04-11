# Makefile for Electronic Telephone Directory Assignments


SRCDIR = src
BINDIR = bin
DOCDIR = doc

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR):$(JUNIT)

vpath %.java $(SRCDIR)
vpath %.class $(BINDIR)

# define general build rule for java sources
.SUFFIXES:  .java  .class

.java.class:
	$(JAVAC)  $(JFLAGS)  $<

#default rule - will be invoked by make
all: Voter.class HashTable.class HashApp.class voterGui.class 
# Rules for generating documentation
doc:
	javadoc -d $(DOCDIR) -link http://docs.oracle.com/javase/8/docs/api/ $(SRCDIR)/*.java $(SRCDIR)

clean:
	@rm -f  $(BINDIR)/*.class
	@rm -Rf doc
