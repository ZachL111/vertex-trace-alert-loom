# vertex-trace-alert-loom

`vertex-trace-alert-loom` explores observability with a small Scala codebase and local fixtures. The technical goal is to package a Scala local lab for alert analysis with append-only fixtures, checkpoint recovery checks, and documented operating limits.

## Why This Exists

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Vertex Trace Alert Loom Review Notes

For a quick review, compare `incident shape` with `span volume` before reading the middle cases.

## Capabilities

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/vertex-trace-alert-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `incident shape` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Shape

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The added Scala path is deliberately direct, with fixtures doing most of the explaining.

## Local Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Verification

The check exercises the source code and the review fixture. `recovery` is the high score at 228; `baseline` is the low score at 164.

## Roadmap

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
