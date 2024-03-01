from textblob import TextBlob


def analyze_sentiment(text):
    blob = TextBlob(text)
    sentiment = blob.sentiment.polarity

    if sentiment > 0:
        return "Positive"
    elif sentiment < 0:
        return "Negative"
    else:
        return "Neutral"


def main():
    text = input("Enter a text string: ")
    sentiment = analyze_sentiment(text)
    print("Sentiment of the text:", sentiment)


if __name__ == "__main__":
    main()
