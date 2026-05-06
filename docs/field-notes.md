# Field Notes

I would read this project from the data inward: cases first, implementation second.

The domain cases cover `span volume`, `latency skew`, `signal loss`, and `incident shape`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` tells me the happy path still works. `baseline` tells me whether the guardrail still has teeth.

The extra check gives the repository a behavior path that can fail for a domain reason, not only a syntax reason.
