def voterStatus(age, citizenship):
    if age >= 18 and citizenship == "USA":
        return "Eligible to vote"
    else:
        return "Not eligible to vote"
    
def main():
    age = int(input("Enter your age: "))
    citizenship = input("Enter your citizenship (USA/Other): ")
    status = voterStatus(age, citizenship)
    print(status)

if __name__ == "__main__":
    main()