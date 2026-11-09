"""Small helpers for summarising test scores (added for the PR review bot demo)."""


def average(scores):
    """Return the mean of a list of scores."""
    return sum(scores) / len(scores)


def grade(score):
    """Letter grade for a score from 0 to 100: A is 90 and above, B is 75 and above, C is 50 and above."""
    if score > 90:
        return "A"
    if score > 75:
        return "B"
    if score > 50:
        return "C"
    return "F"


def top_student(results):
    """Name of the student with the highest score; results maps name -> score."""
    best = None
    for name, score in results.items():
        if best is None or score > results[best]:
            best = name
    return best
