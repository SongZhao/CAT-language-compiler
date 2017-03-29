# CAT-language-compiler
simple compiler
This section defines the lexical level of the CAT language. At this level, we have the following language issues:

Tokens

The tokens of the moo language are defined as follows:
Any of the following reserved words (remember that you will need to give the JLex patterns for reserved words before the pattern for identifier):
bool  int   void  true  false  struct
cin   cout  if    else  while  return  
Any identifier (a sequence of one or more letters and/or digits, and/or underscores, starting with a letter or underscore, excluding reserved words).
Any integer literal (a sequence of one or more digits).
Any string literal (a sequence of zero or more string characters surrounded by double quotes). A string character is either
an escaped character: a backslash followed by any one of the following six characters:
n
t
a single quote
a double quote
a question mark
another backslash
or
a single character other than new line or double quote or backslash.
Examples of legal string literals:
""
"&!88"
"use \n to denote a newline character"
"include a quote like this \" and a backslash like this \\"
Examples of things that are not legal string literals:
"unterminated
"also unterminated \"
"backslash followed by space: \ is not allowed"
"bad escaped character: \a AND not terminated
Any of the following one- or two-character symbols:
{      }      (      )      ;      
,      .      <<     >>     ++
--     +      -      *      /
!      &&     ||     ==     !=
<      >      <=     >=     =
Token "names" (i.e., values to be returned by the scanner) are defined in the file sym.java. For example, the name for the token to be returned when an integer literal is recognized is INTLITERAL and the token to be returned when the reserved word int is recognized is INT.

Note that code telling JLex to return the special EOF token on end-of-file has already been included in the file moo.jlex -- you don't have to include a specification for that token. Note also that the READ token is for the 2-character symbol >> and the WRITE token is for the 2-character symbol <<

If you are not sure which token name matches which token, ask!

Comments

Text starting with a double slash (//) or a sharp sign (#) up to the end of the line is a comment (except of course if those characters are inside a string literal). For example:
// this is a comment
# and so is this
The scanner should recognize and ignore comments (but there is no COMMENT token).

Whitespace

Spaces, tabs, and newline characters are whitespace. Whitespace separates tokens and changes the character counter, but should otherwise be ignored (except inside a string literal).
Illegal Characters

Any character that is not whitespace and is not part of a token or comment is illegal.
Length Limits

You may not assume any limits on the lengths of identifiers, string literals, integer literals, comments, etc.
