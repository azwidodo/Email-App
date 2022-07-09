from random import randint

# Create the same Email class as the one in Java


class Email:
    def __init__(self, first_name, last_name):
        print("~~~~~~~~~~~~~~~~~~~~")

        self.__first_name = first_name
        self.__last_name = last_name
        print(f"CREATING EMAIL FOR: {first_name} {last_name}")

        # ask for department by calling function
        self.__department = self.__set_department()

        # create email from above info
        self.__email = f"{first_name.lower()}.{last_name.lower()}@{self.__department}potato.com"
        print(f"EMAIL HAS BEEN CREATED: {self.__email}")

        # generate random password by calling function
        self.__password = self.__random_password()
        print(f"YOUR PASSWORD IS: {self.__password}")

        self.__mailbox_cap = 500
        self.__alt_email = None

        print("~~~~~~~~~~~~~~~~~~~~")

    # private function to set department
    def __set_department(self):

        print("Departments:")
        print("1. HR")
        print("2. Marketing")
        print("3. Finance")
        print("4. IT")
        print("5. Operations")
        print("0. None")

        code = int(input("CHOOSE DEPARTMENT CODE: "))

        if code == 1:
            return "hr."
        elif code == 2:
            return "marketing."
        elif code == 3:
            return "finance."
        elif code == 4:
            return "it."
        elif code == 5:
            return "operations."
        else:
            return ""

    # private function to generate random password
    def __random_password(self, length=10):
        characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@£&?%#"
        password = ["" for i in range(length)]

        for i in range(length):
            index = randint(0, len(characters) - 1)
            password[i] = characters[index]

        return "".join(password)

    # function to change password
    def set_password(self, password):
        print("Setting password...")
        self.__password = password

    # function to change mailbox capacity
    def set_mailbox_cap(self, capacity):
        print("Setting mailbox capacity...")
        self.__mailbox_cap = capacity

    # function to change alternate email
    def set_alternate_email(self, alt_email):
        print("Setting alternate email...")
        self.__alt_email = alt_email

    # function to show information
    def show_info(self):
        print("~~~~~~~~~~~~~~~~~~~~")
        print(f"Name: {self.__first_name} {self.__last_name}")
        print(f"Email: {self.__email}")
        print(f"Password: {self.__password}")
        print(f"Mailbox capacity: {self.__mailbox_cap}")
        print(f"Alternate email: {self.__alt_email}")
        print("~~~~~~~~~~~~~~~~~~~~")


email = Email("Frank", "Major")
email.set_password("C#4UgM3ntED")
email.set_mailbox_cap(350)
email.set_alternate_email("fsharpmajor@gmail.com")
email.show_info()
