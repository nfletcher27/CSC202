# This program uses the Caesar Cipher to either decode or encrypt a message using a cypher.txt file or creating one

import os
def caesarCipher(string, jump):
    encrypt = ""
    for i in range(len(string)):
        pos = string[i]
        if pos.isspace():
            encrypt += " "
        elif pos.isupper():
            encrypt += chr((ord(pos) + jump - 65) % 26 + 65)
        else:
            encrypt += chr((ord(pos) + jump - 97) % 26 + 97)
    return encrypt


done = False
while done == False:
    choice = input("Would you like to encrypt text to a file or decrypt a text file?")

    if choice == "encrypt":
        message = input("Ok! What is your message?")
        distance = input("And what shift would you like?")
        file = open("cypher.txt", "w")
        encrypted = caesarCipher(message, int(distance))
        file.write(encrypted)
        
        print("A file titled 'cypher.txt' has been created in the same directory "
              "as this program, or if cypher.txt existed already it has been overwritten")
        
        file.close()
        done = True

    elif choice == "decrypt":
        print("Great, let's check for a cypher.txt file (this must be present).")
        
        if os.path.exists("cypher.txt"):
            distance = input("File found! What is the shift of the original decryption you would like to try?")
            file = open("cypher.txt", "r")
            contents = file.read()
            print("The shifted code is: " + caesarCipher(contents, 26-int(distance)))
            file.close()

        else:
            print("It appears you are missing the cypher.txt file from your current directory, please check and rerun.")
        done = True
        
    else:
        print("You did not answer with 'encrypt' or 'decrypt', please try again.")

finished = input("Press any key to end program.")
